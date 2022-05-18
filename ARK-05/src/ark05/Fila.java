package ark05;

import java.util.ArrayList;

public interface Fila {

    void cadastrar(String nome);

    void trocarLugar(int pos1, int pos2);

    String chamarPrimeiro();

    void desistir(int pos);

    ArrayList<String> listarFila();
}
