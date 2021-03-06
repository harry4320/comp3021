package Map.Occupant;

/**
 * An abstract class representing things that can occupy classes which implement the Occupiable interface
 */
public abstract class Occupant {
    private int r;
    private int c;

    /**
     * @param r The row position of the occupant
     * @param c The column position of the occupant
     */
    public Occupant(int r, int c) {
        setPos(r, c);
    }

    /**
     * @return The textual representation of the crate. Use the lowercase letter ID.
     */
    public abstract char getRepresentation();

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public void setPos(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
