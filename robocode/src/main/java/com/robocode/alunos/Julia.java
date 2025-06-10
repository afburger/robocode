package com.robocode.alunos;

import robocode.BulletHitEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

/*
 *   Robo desenvolvido para atender os seguintes rquisitos:   
 *   - Move para frente e para trás de forma crescente (100-200-300-400-500-100-200-300-400-500-100...)
 *   - Para cada vez que o robô move para FRENTE deve-se dar um giro completo com o canhão
 *   - Sempre que o robô escanear um inimigo deve-se disparar com força 1 e girar o tanque 90°
 *   - Sempre que o robô acertar um inimigo o robô deve ficar parado por alguns segundos (2 a 5), dica: usar While()
 *   - Após o robô ficar parado a força do tiro deve aumentar em 1, após isso, se a força for igual ou maior que 5 deve-se definir a força para 1.
 */
public class Julia extends Robot {
    double contagemPassos = 0;
    double forcaTiro = 1;
    static final double INCREMENTO = 100;
    
    // Execução do robô
    public void run() {
        // Inicialização do robô
        // setColors(Color.red,Color.blue,Color.green); // body,gun,radar

        // Bloco de repetição
        while (true) {
            // Move o robô para frente
            moverParaFrente();
            // Move o robô para trás.
            moverParaTras();
        }
    }
   
    /**
     * Executa as funções ao mover o robô para frente.
     */
    public void moverParaFrente() {
        // Verifica se a contagem de passos é igual a 500
        if (contagemPassos >= 500) {
            // Se for igual a 500 deve iniciar em 100 novamente.
            contagemPassos = INCREMENTO;
        } else {
            // Se ainda não chegou a 500, incrementa mais 100 na contagem de passos.
            contagemPassos += INCREMENTO;
        }
        // Move para frente a quantidade de passos em ordem crescente.
        ahead(contagemPassos);
        // Gira o canhão 360º (uma volta completa, cada vez que anda pra frente)
        turnGunRight(360); // gira o canhão para a direita
    }

    /**
     * Executa as funções ao mover o robô para trás.
     */
    public void moverParaTras() {
        // Verifica se a contagem de passos é igual a 500
        if (contagemPassos >= 500) {
             // Se for igual a 500 deve iniciar em 100 novamente.
            contagemPassos = INCREMENTO;
        } else {
            // Se ainda não chegou a 500, incrementa mais 100 na contagem de passos.
            contagemPassos += INCREMENTO;
        }
        // Move para trás a quantidade de passos em ordem crescente.
        back(contagemPassos);
    }

    /**
     * Quando um tiro seu atinge o outro robô ele chama esse evento.
     */
    @Override
    public void onBulletHit(BulletHitEvent event) {
        // Faz a pausa ao acertar um inimigo.
        long tempoInicio = getTime();
        while (getTime() - tempoInicio < 2 * 60) { // 5 segundos * 60 ticks por segundo
            doNothing(); // Não faz nada por 1 tick
        }
        // Aumenta a força do tiro.
        forcaTiro++;
        if (forcaTiro >= 5) {
            forcaTiro = 1;
        }
    }

    /**
     * Comando responsável por conferir que outro robô foi identificado pelo scanner
     */
    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        // Atira com força 1
        fire(forcaTiro);
        // E jira o tanque 90º
        turnLeft(90); // gira o tanque para esquerda
    }

}
