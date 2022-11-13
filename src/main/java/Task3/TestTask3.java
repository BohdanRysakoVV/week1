package Task3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTask3 {
    private Task3 task3 = new Task3();


    @Test
    public void testSortFigureByVolume() {
        Ball ball1 = new Ball(2);
        Ball ball2 = new Ball(50);
        Ball ball3 = new Ball(20);

        Cube cube1 = new Cube(10);
        Cube cube2 = new Cube(5);
        Cube cube3 = new Cube(13);

        Cylinder cylinder1 = new Cylinder(2, 5);
        Cylinder cylinder2 = new Cylinder(13, 5);
        Cylinder cylinder3 = new Cylinder(10, 10);

        List<Figure> figureList1Input = new ArrayList<>();
        figureList1Input.add(ball1);
        figureList1Input.add(cylinder1);
        figureList1Input.add(cube1);

        List<Figure> figureList2Input = new ArrayList<>();
        figureList2Input.add(ball2);
        figureList2Input.add(cylinder2);
        figureList2Input.add(cube2);

        List<Figure> figureList3Input = new ArrayList<>();
        figureList3Input.add(ball3);
        figureList3Input.add(cube3);
        figureList3Input.add(cylinder3);


        List<Figure> figureList1ExpectedOutput = new ArrayList<>();
        figureList1ExpectedOutput.add(cube1);
        figureList1ExpectedOutput.add(cylinder1);
        figureList1ExpectedOutput.add(ball1);

        List<Figure> figureList2ExpectedOutput = new ArrayList<>();
        figureList2ExpectedOutput.add(ball2);
        figureList2ExpectedOutput.add(cylinder2);
        figureList2ExpectedOutput.add(cube2);

        List<Figure> figureList3ExpectedOutput = new ArrayList<>();
        figureList3ExpectedOutput.add(ball3);
        figureList3ExpectedOutput.add(cylinder3);
        figureList3ExpectedOutput.add(cube3);

        task3.sortFiguresByVolume(figureList1Input);
        task3.sortFiguresByVolume(figureList2Input);
        task3.sortFiguresByVolume(figureList3Input);

        Assert.assertEquals(figureList1Input, figureList1ExpectedOutput);
        Assert.assertEquals(figureList2Input, figureList2ExpectedOutput);
        Assert.assertEquals(figureList3Input, figureList3ExpectedOutput);
    }
}
