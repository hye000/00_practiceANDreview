package object_array.practice.shape.run;

import object_array.practice.shape.controller.SquareController;
import object_array.practice.shape.controller.TriangleController;
import object_array.practice.shape.view.ShapeMenu;

public class Run {

	public static void main(String[] args) {
		ShapeMenu sm = new ShapeMenu();
		TriangleController tc = new TriangleController();
		SquareController sc = new SquareController();

		sm.inputMenu();
	}

}
