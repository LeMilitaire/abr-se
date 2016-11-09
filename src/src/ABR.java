/**
 * Created by renau on 09/11/2016.
 */
import java.lang.Integer;
public class ABR {
    public ABR() {

        // Creation des noeuds
        class Node(){
            private int value;
            public Node gauche = null;
            public Node droit = null;

            Node( int value){
                this.value = value;
            }
            // Getter
        public int getValue () {
            return this.value;
        }
    }
        //root
        private Node root = null;
        private int nbElements = 0;

        // Fonctions

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        //cas arbre vide
        if (root == null) {
            root = new Node(value);
            nbElements += 1;
        } else {
            //TODO: Create a point from an existing root
        }
    }


    public int nbElements() {
        return nbElements;
    }

    private boolean contains(int value) {
        for (Node node : this) {
            if (node.getvalue() == value) {
                return true;
            }
        }
        return false;
    }
}

    public void toList(java.util.List<java.lang.Integer> l){

    }
}
