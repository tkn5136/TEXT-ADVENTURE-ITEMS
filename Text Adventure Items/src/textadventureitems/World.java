package textadventureitems;

    import java.awt.Point;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class World {
        private String[][] worldMap;
        private Point startingPosition;

        public World() {
            this.worldMap = new String[5][5];
            this.startingPosition = new Point(2, 2);
        }

        public void loadTiles() {
            ArrayList<String> rows = new ArrayList<String>();

            try {
                File file = new File("map.txt");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String row = scanner.nextLine();
                    rows.add(row);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
                e.printStackTrace();
            }

            for (int i = 0; i < rows.size(); i++) {
                String[] cols = rows.get(i).split("\\s+");

                for (int j = 0; j < cols.length; j++) {
                    worldMap[i][j] = cols[j];
                }
            }
        }

        public String[][] getWorldMap() {
            return worldMap;
        }

        public Point getStartingPosition() {
            return startingPosition;
        }
    }
