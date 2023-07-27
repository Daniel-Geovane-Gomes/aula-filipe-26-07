//Crie um programa com JOptionPane, que peça 3 notas e informe a média dos alunos
package calculamedianotas;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Utilizando array list, pegar quantos inteiros o usuário quiser digitar
        //No final indique qual a menor, qual o maior, e exibir a média dos inteiros
        ArrayList<Integer> numbers = new ArrayList<>();

        int media = 0;
        String decision = "";
        while (!decision.equals("x")) {
            decision = JOptionPane.showInputDialog("Digite a nota ou x para encerrar: ");
            if (!decision.equals("x")) {

                numbers.add(Integer.parseInt(decision));

            }
        }

        Integer menor = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < menor) {
                menor = numbers.get(i);
            }

        }

        Integer maior = numbers.get(0);
        for (Integer n : numbers) {
            if (n > maior) {
                maior = n;
            }
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            media += it.next();
        }
        media /= numbers.size();

        JOptionPane.showMessageDialog(null, "Dos números inteiros digitados\n"
                + "O menor é: " + menor + "\n"
                + "O maior é: " + menor + "\n"
                + "A média: " + media + "\n");

    }
}

/**
 * Double[] notas = new Double[1]; String resp = "";
 *
 * int contador = 0; while(!resp.equals("-1")){ //resp =
 * (JOptionPane.showInputDialog("")) resp = (JOptionPane.showInputDialog("Digite
 * a nota ou -1 para encerrar: ")); if(!resp.equals("-1")){ if(notas.length ==
 * contador){ Double[] newNotas = new Double[contador + 1]; for(int i = 0; i <
 * notas.length; i++){ newNotas[i]; } }
 *
 * };
 */
