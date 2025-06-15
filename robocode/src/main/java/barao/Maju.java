package barao;
import robocode.*;

/**
 * Maju - Um robô desenvolvido pelas alunas: Júlia Reiter Lueders e Maria Virginia Pedroso do 8.5
 */
public class Maju extends Robot
{
	// int = tipo de variável
	// forcaTiro = nome da variável
	int forcaTiro = 1;
	// run = execução do robô 
	public void run() {
    // passos = nome variável 
	int passos = 100;
	// while = enquanto for verdadeiro vai continuar repetindo
		while(true) {
			ahead(passos); // andar para frente
			passos = passos + 100; // pegar o valor da variável, aumetar a quantidade indicada ( atualiza a variável com o valor calculado)
			turnGunLeft(360);  // girar o canhão para esquerda 360º
			
			if (passos >= 500){  // verificar se passos é >= 500
				passos = 100; // se for maior ou igual a 500 define a variável de passos para 100 novamente.
			}

			
			back(passos);  // andar para trás
			
			passos = passos + 100;  // pegar o valor da variavel, aumetar a quantidade indicada ( atualiza a variável com o valor calculado)
			if (passos >= 500){  // verificar se passos é >= 500
				passos = 100; // se for maior ou igual a 500 define a variável de passos para 100 novamente.
			}
		}
	}

	/**
	 * onScannedRobot: executa quando encontrar um robô inimigo.
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(forcaTiro); // atira com a força definida
		turnRight(90);  //gira o robo para direita em 90º
	}

	/**
	 * onHitByBullet: executa quando acertar um tiro no robô adversário.
	 */
	public void onHitByBullet(HitByBulletEvent e) {
	    /** verificar com o professor como fazer o robô ficar parado

		while (condicao) {
			
		}
		
		*/
		
		forcaTiro = forcaTiro + 1;  // pegar o valor da variavel, aumetar a quantidade indicada ( atualizar com o valor calculado)
		if (forcaTiro >= 5){ // verificar se forcaTiro é >= 5
			forcaTiro = 1; // Se for maior ou igual a 5 define a variável forcaTiro com 1 novamente.
		}
	}

}
