public class Backpack {
    String[] food = {"banana","nuggets","apple"};
    String[] equipment = {"gloves","rope","glasses"};
    String[] itens = {"key","photo","note"};
    

    void search(String x, String[] y){
        for (int i = 0; i < y.length;i++){
            String z = y[i];
            if (z == x){
                System.out.print("[Found "+x+"] ");
            }
            else{
                System.out.print("X ");
            }
        }
    }
}