public class Game {
    public static void main(String[] args) throws Exception {
        Backpack myBackpack = new Backpack();
        Character myCharacter = new Character();

        myCharacter.myStats.showallstats();
        myBackpack.search("photo", myBackpack.itens);
    }
}