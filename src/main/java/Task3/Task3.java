package Task3;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {

    public void sortFiguresByVolume(Collection<Figure> figuresCollection) {


        Map<Figure, Double> figuresMap = figuresCollection.stream()
                .collect(Collectors.toMap(Figure -> Figure, Figure::findFigureVolume));

        figuresCollection.clear();

        figuresMap.entrySet().stream()

                .sorted(Map.Entry.<Figure, Double>comparingByValue().reversed())
                .forEach(
                        (f) -> {
                            figuresCollection.add(f.getKey());
                        }
                );

    }
}
