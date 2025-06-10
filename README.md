# 🤖 Robocode - Cultura Digital

Repositório destinado aos exercícios e trabalhos realizados na disciplina de **Cultura Digital**, onde os alunos aprendem programação através do [Robocode](https://robocode.sourceforge.io/) - uma plataforma educacional que ensina Java através de batalhas de robôs programáveis.

## 📋 Sobre o Projeto

O Robocode é uma ferramenta pedagógica que combina aprendizado de programação com diversão. Os estudantes criam robôs virtuais em Java que competem em uma arena, desenvolvendo habilidades de:

- 💻 **Programação em Java**
- 🧠 **Lógica de programação**
- 🎯 **Algoritmos e estratégias**
- 🔄 **Estruturas de controle**
- 📊 **Manipulação de eventos**

## 🚀 Como Começar

### Pré-requisitos
- Java JDK 8 ou superior
- Robocode instalado ([Download aqui](https://robocode.sourceforge.io/))
- IDE de sua preferência (recomendado: VS Code, IntelliJ ou Eclipse)

### Instalação
1. Clone este repositório
```bash
git clone [url-do-repositorio]
```

2. Importe o projeto na sua IDE
3. Configure o classpath com as bibliotecas do Robocode
4. Compile e teste seus robôs!

## 📝 Estrutura do Projeto

```
robocode/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── robocode/
│                   ├── professor/    # Códigos exemplo do professor
│                   ├── alunos/       # Códigos desenvolvidos pelos alunos
│                   └── batalhas/     # Configurações de batalhas
├── docs/                             # Documentação adicional
└── README.md
```

## 🤖 Código Exemplo - Template Básico

O professor disponibilizou este template como ponto de partida:

```java
package professor;
import robocode.*;

/**
 * Template básico para criação de robôs
 * Exemplo didático com os principais comandos do Robocode
 */
public class NomeDoRobo extends Robot {
    
    int nomeDaVariavel = 0;
    
    public void run(){
        while(true){ // Loop principal - repete continuamente
            
            // === MOVIMENTAÇÃO ===
            ahead(100);      // Move para frente (100 pixels)
            back(100);       // Move para trás (100 pixels)
            
            // === ROTAÇÃO DO TANQUE ===
            turnRight(90);   // Gira o tanque 90° à direita
            turnLeft(90);    // Gira o tanque 90° à esquerda
            
            // === ROTAÇÃO DO CANHÃO ===
            turnGunRight(360);  // Gira o canhão 360° à direita
            turnGunLeft(360);   // Gira o canhão 360° à esquerda
            
            // === ESTRUTURA CONDICIONAL ===
            if (1 > 0) {
                // Seu código aqui
            } else {
                // Código alternativo
            }
        }
    }
    
    /**
     * Evento disparado quando o radar detecta outro robô
     * @param e Informações sobre o robô detectado
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1); // Atira com potência 1 (1-3)
    }
    
    /**
     * Evento disparado quando nosso tiro acerta outro robô
     * @param e Informações sobre o impacto
     */
    public void onBulletHit(BulletHitEvent e){
        // Código para quando acerta o alvo
        // Ex: comemorar, ajustar estratégia, etc.
    }
}
```

## 🎯 Principais Comandos do Robocode

### Movimentação
- `ahead(distância)` - Move para frente
- `back(distância)` - Move para trás
- `turnRight(graus)` - Gira o tanque à direita
- `turnLeft(graus)` - Gira o tanque à esquerda

### Combate
- `fire(potência)` - Atira (potência: 0.1 a 3.0)
- `turnGunRight(graus)` - Gira o canhão à direita
- `turnGunLeft(graus)` - Gira o canhão à esquerda
- `turnRadarRight(graus)` - Gira o radar à direita
- `turnRadarLeft(graus)` - Gira o radar à esquerda

### Informações
- `getX()`, `getY()` - Posição atual
- `getHeading()` - Direção do tanque
- `getEnergy()` - Energia restante
- `getTime()` - Tempo atual da batalha

## 📚 Recursos de Aprendizado

- [Documentação oficial do Robocode](https://robowiki.net/wiki/Robocode_Documentation)
- [Tutorial para iniciantes](https://robowiki.net/wiki/Robocode/My_First_Robot)
- [Referência da API](https://robocode.sourceforge.io/docs/robocode/)

## 🏆 Desafios e Exercícios

1. **Robô Básico**: Implementar movimento e tiro simples
2. **Robô Patrulheiro**: Criar padrões de movimento
3. **Robô Caçador**: Desenvolver estratégias de busca
4. **Robô Avançado**: Implementar IA e estratégias complexas

## 🤝 Contribuindo

Alunos podem contribuir com:
- Novos robôs e estratégias
- Melhorias na documentação
- Tutoriais e guias
- Relatórios de bugs ou melhorias

## 📄 Licença

Este projeto é destinado para fins educacionais na disciplina de Cultura Digital.

---

**Dica**: Comece com pequenas modificações no código exemplo e vá evoluindo gradualmente. A programação é uma jornada de aprendizado contínuo! 🚀