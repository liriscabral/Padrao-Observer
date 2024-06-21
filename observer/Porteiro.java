package observer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {
    
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer)  {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int valor = scanner.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date(valor));

                for(ChegadaAniversarianteObserver observer: this.observers) {
                    observer.chegou(event);
                }                
            } else {
                System.out.println("Manter silêncio para a surpresa!");
            }
        }
    }

}
