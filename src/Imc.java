public class Imc {
    public void calcularImc(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);
        System.out.println("O IMC é: " + imc);
        diagnosticar(peso, altura, imc);
    }

    private void diagnosticar(double peso, double altura, double index) {
        if (index < 18.5) {
            System.out.println("Você está abaixo do peso.");
            System.out.println("Pode indicar desnutrição, falta de massa muscular ou outros problemas de saúde.");
        } else if (index >= 18.5 && index < 25) {
            System.out.println("Seu peso está normal.");
            System.out.println("Equilíbrio saudável entre peso e altura, associado a menor risco de doenças crônicas.");
        } else if (index >= 25 && index < 30) {
            System.out.println("Você está com sobrepeso.");
            System.out.println("Pode indicar excesso de peso, aumentando o risco de doenças como diabetes tipo 2, pressão alta e problemas cardíacos.");
        } else if (index >= 30 && index < 35) {
            System.out.println("Você está com obesidade (grau I).");
            System.out.println("Características: Indica um excesso significativo de peso, aumentando substancialmente o risco de doenças crônicas como diabetes, hipertensão e doenças cardíacas.");
        } else if (index >= 35 && index < 40) {
            System.out.println("Você está com obesidade (grau II).");
            System.out.println("Indica uma obesidade mais severa, com maior risco de complicações de saúde, incluindo problemas articulares, apneia do sono e dificuldades respiratórias.");
        } else {
            System.out.println("Você está com obesidade mórbida (grau III).");
            System.out.println("Esta é a forma mais grave de obesidade, associada a um risco muito elevado de doenças crônicas graves, como doença cardíaca, derrame, diabetes tipo 2 e certos tipos de câncer.");
        }
    }
}
