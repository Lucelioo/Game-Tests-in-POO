public class Character {
    String nome = "Arthas";
    int idade = 27;
    String classe = "Necromante";
    String titulo = "Lich Rei";
    Stats myStats = new Stats();

    void presentation(){
        System.out.print("Ola, me chamo "+nome+" filho de Thassarean e atualmente tomei meu poder como o "+titulo);
    }
}