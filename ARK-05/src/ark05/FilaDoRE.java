
package ark05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FilaDoRE implements Fila {

    private ArrayList<String> alunos;

    public FilaDoRE() {
        alunos = new ArrayList<>();
    }

    @Override
    public void cadastrar(String nome) {
        alunos.add(nome);
    }

    @Override
    public void trocarLugar(int pos1, int pos2) {
        String aluno = alunos.get(pos1);
        alunos.set(pos1, alunos.get(pos2));
        alunos.set(pos2, aluno);
    }

    @Override
    public String chamarPrimeiro() {
        return alunos.get(0);
    }

    @Override
    public void desistir(int pos) {
        alunos.remove(pos);
    }

    @Override
    public ArrayList<String> listarFila() {
        return alunos;
    }

    public int tamanha() {
        return alunos.size();
    }
}
