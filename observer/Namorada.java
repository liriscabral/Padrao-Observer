package observer;

public class Namorada implements ChegadaAniversarianteObserver {
    
    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Se esconder...");
        System.out.println("Surpresaaa! Parabéns pra você!!!");
    }

}
