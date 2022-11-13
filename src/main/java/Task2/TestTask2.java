package Task2;

import org.junit.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTask2 {
    private final Task2 task2 = new Task2();

    @Test
    public void topFiveHashTagsTest() {

        List<String> test1input = new ArrayList<>();

        test1input.add("Simple #text with some #HashTags");


        List<String> test1ExpectedOutput = new ArrayList<>();

        test1ExpectedOutput.add("#text - 1");
        test1ExpectedOutput.add("#HashTags - 1");

        List<String> test2input = new ArrayList<>();

        test2input.add("#six SimpleText #five #four #three Simple Text #two #one");
        test2input.add("#six SimpleText #five #four #three Simple Text #two ");
        test2input.add("#six SimpleText #five #four #three Simple Text  ");
        test2input.add("#six SimpleText #five #four  Simple Text  ");
        test2input.add("#six SimpleText #five   Simple Text  ");
        test2input.add("#six SimpleText  Simple Text  ");

        List<String> test2ExpectedOutput = new ArrayList<>();

        test2ExpectedOutput.add("#six - 6");
        test2ExpectedOutput.add("#five - 5");
        test2ExpectedOutput.add("#four - 4");
        test2ExpectedOutput.add("#three - 3");
        test2ExpectedOutput.add("#two - 2");


        List<String> test3input = new ArrayList<>();
        List<String> test3ExpectedOutput = new ArrayList<>();


        List<String> test4input = new ArrayList<>();

        test4input.add("#java is a high-level, class-based, object-oriented #programming language ");
        test4input.add("The syntax of #java is similar to C and C++,");
        test4input.add("#java was one of the most popular #programming languages in use according to GitHub");
        test4input.add("#java is a high-level, class-based, object-oriented #programming language ");
        test4input.add("#java applications are typically compiled to bytecode that can run on any #java virtual machine (#JVM ) regardless of the underlying computer architecture.");
        test4input.add("#JVM which is free open-source software and used by most developers and is the default #JVM for almost all #Linux distributions.");

        List<String> test4ExpectedOutput = new ArrayList<>();

        test4ExpectedOutput.add("#java - 5");
        test4ExpectedOutput.add("#programming - 3");
        test4ExpectedOutput.add("#JVM - 2");
        test4ExpectedOutput.add("#Linux - 1");


        Collections.sort(test1ExpectedOutput);
        Collections.sort(test2ExpectedOutput);
        Collections.sort(test3ExpectedOutput);
        Collections.sort(test4ExpectedOutput);

        Assert.assertTrue(test1ExpectedOutput.containsAll(task2.topFiveHashTags(test1input)));
        Assert.assertTrue(test2ExpectedOutput.containsAll(task2.topFiveHashTags(test2input)));
        Assert.assertTrue(test3ExpectedOutput.containsAll(task2.topFiveHashTags(test3input)));
        Assert.assertTrue(test4ExpectedOutput.containsAll(task2.topFiveHashTags(test4input)));
    }
}
