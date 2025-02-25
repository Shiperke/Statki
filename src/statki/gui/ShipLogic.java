package statki.gui;

public class ShipLogic {

	private int row;
	private int col;
	private int size;
	private boolean isVertical;

	public ShipLogic(int row, int col, int size, boolean isVertical) {
		super();
		this.row = row;
		this.col = col;
		this.size = size;
		this.isVertical = isVertical;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isVertical() {
		return isVertical;
	}

	public void setVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}


	
}
