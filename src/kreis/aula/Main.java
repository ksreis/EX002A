package kreis.aula;

public class Main {
    public static void main(String[] args) {
        // Criar a árvore
         Arvore arvore = new Arvore ();
        
        // Inserir os nós na árvore
        arvore.insert(12);
        arvore.insert(4);
        arvore.insert(16);
        arvore.insert(2);
        arvore.insert(8);
        arvore.insert(6);
        
        try {
            // Determinar o nível do nó com valor 6
            int nivel = arvore.nodeLevel(arvore.raiz(), 6);
            System.out.println("Nível do nó com valor 6: " + nivel);
        } catch (Exception e) {
            System.out.println("Valor não encontrado na árvore.");
        }
    }
}