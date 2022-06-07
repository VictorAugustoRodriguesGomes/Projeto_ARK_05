
package ark05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FilaDoRE implements Fila {

    private ArrayList<String> pessoas;

    public FilaDoRE() {
        pessoas = new ArrayList<>();
    }

    @Override
    public void cadastrar(String nome) {
        pessoas.add(nome);
    }

    @Override
    public void trocarLugar(int pos1, int pos2) {
        String aluno = pessoas.get(pos1);
        pessoas.set(pos1, pessoas.get(pos2));
        pessoas.set(pos2, aluno);
    }

    @Override
    public String chamarPrimeiro() {
        return pessoas.get(0);
    }

    @Override
    public void desistir(int pos) {
        pessoas.remove(pos);
    }

    @Override
    public ArrayList<String> listarFila() {
        return pessoas;
    }

    public int tamanha() {
        return pessoas.size();
    }
}
