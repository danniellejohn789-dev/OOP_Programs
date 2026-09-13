`import java.util.*;

public class Atendido_lab {

    ArrayList elements = new ArrayList<>(); //RAW TYPE

    public Atendido_lab Union(Atendido_lab B){

        Atendido_lab AUB = new Atendido_lab();

        for (int q = 0; q < B.elements.size(); q++){

            AUB.elements.add(this.elements.get(q));

            if (!this.elements.contains(B.elements.get(q))){
                AUB.elements.add(B.elements.get(q));
            }
        }

        return AUB;
    }

     public Atendido_lab Intersection(Atendido_lab B){

        Atendido_lab AnB = new Atendido_lab();

        for (int q = 0; q < B.elements.size(); q++){

            if (this.elements.contains(B.elements.get(q))){
                AnB.elements.add(B.elements.get(q));
            }
        }

        return AnB;

    }

    public int Cardinality(){
        return this.elements.size();
    }

    public void clear(){
        this.elements.clear();
    }

    public static void main(String[] args) {
        
        Atendido_lab A = new Atendido_lab();
        
        for (int q = 1; q < 4; q++){
            A.elements.add(q);
        }

        Atendido_lab B = new Atendido_lab();
        
        for (int q = 3; q < 6; q++){
            B.elements.add(q);
        }

        //Atendido_lab AUB = new Atendido_lab();

        Atendido_lab AUB = A.Union(B);
        Atendido_lab AnB = A.Intersection(B);
        Atendido_lab AUBnC = A.Union(B).Intersection(B);

        System.out.println("A =  " + A.elements);
        System.out.println("B = " + B.elements );

        System.out.println("\nAUB = " + AUB.elements);
        System.out.println("AnB = " + AnB.elements);
        System.out.println("AUBnC = " + AUBnC.elements);

        System.out.println("\n|A| = " + A.Cardinality());
        System.out.println("|B| = " + B.Cardinality());
        System.out.println("|AUB| = " + AUB.Cardinality());
        System.out.println("|AnB| = " + AnB.Cardinality());
        System.out.println("|AUBnC| = " + AUBnC.Cardinality()); // gago yung .Cardinality nagawa sya kahit walang .elements kasi ang tinutukoy na sa method na to is yung elements nung object na nag tawag nito

        A.clear();
        System.out.println("\nA = " + A.elements);

    }
    
}
