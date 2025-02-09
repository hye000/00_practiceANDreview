package com.kh.hw.shape.run;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
import com.kh.hw.shape.view.ShapeMenu;

public class Run {

	public static void main(String[] args) {
		ShapeMenu sm = new ShapeMenu();
		TriangleController tc = new TriangleController();
		SquareController sc = new SquareController();

		sm.inputMenu();
	}

}
