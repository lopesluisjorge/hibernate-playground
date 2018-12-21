package controleprojetos;

import controleprojetos.infra.EMFactory;

public class Main {

    public static void main(String[] args) {
        new EMFactory().close();
    }

}
