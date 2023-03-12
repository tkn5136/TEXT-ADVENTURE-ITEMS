package textadventureitems;
import java.util.List;
import java.util.ArrayList;
public class MapTile {
    private int x;
    private int y;

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<MapTile> adjacentMoves() {
        List<MapTile> moves = new ArrayList<>();
        moves.add(new MapTile(x + 1, y));
        moves.add(new MapTile(x - 1, y));
        moves.add(new MapTile(x, y + 1));
        moves.add(new MapTile(x, y - 1));
        return moves;
    }
}