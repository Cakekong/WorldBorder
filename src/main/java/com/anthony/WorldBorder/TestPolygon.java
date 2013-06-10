package com.anthony.WorldBorder;

public class TestPolygon {

	public static boolean testContainment(double xin, double yin,
			double[] pointsx, double[] pointsy) {
		int i, j;
		boolean result = false;
		for (i = 0, j = pointsx.length - 1; i < pointsx.length; j = i++) {
			if ((pointsy[i] > yin) != (pointsy[j] > yin)
					&& (xin < (pointsx[j] - pointsx[i]) * (yin - pointsy[i])
							/ (pointsy[j] - pointsy[i]) + pointsx[i])) {
				result = !result;
			}
		}
		return result;
	} // End testContainment
	
	
	
    /**
     * Return true if the given point is contained inside the boundary.
     * See: http://www.ecse.rpi.edu/Homepages/wrf/Research/Short_Notes/pnpoly.html
     * @param test The point to check
     * @return true if the point is inside the boundary, false otherwise
     *
     */
//	public boolean contains(Point[] point) {
//		int i,j;
//		boolean result = false;
//		for (i = 0, j = point.length - 1; i < point.length; j = i++) {
//			if ((point[i].y > test.y) != (point[j].y > test.y)
//					&& (test.x < (point[j].x - point[i].x)
//							* (test.y - point[i].y)
//							/ (point[j].y - point[i].y) + point[i].x)) {
//				result = !result;
//			}
//		}
//		return result;
//	}
	
//
//	public static void main(String[] args) {
//		// Test testContainment
//		float xin = 499;
//		float yin = 499;
//		float[] pointsx = { 0, 0, 500, 500 };
//		float[] pointsy = { 0, 500, 500, 0 };
//		System.out.println(testContainment(xin, yin, pointsx, pointsy));
//	}
} // End TestPolygon