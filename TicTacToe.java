public class TicTacToe {
    public static void main(String[] args) {
        Table table = new Table(3);
        Table.inputRoute(1, 1);
        Table.inputRoute(2, 1);
        Table.inputRoute(3, 1);
        // Table.inputRoute(4, 0);
        // Table.inputRoute(5, 1);
        // Table.inputRoute(6, 0);
        // Table.inputRoute(7, 1);
        // Table.inputRoute(8, 0);
        // Table.inputRoute(9, 1);
        Table.showTable();
    }
}
