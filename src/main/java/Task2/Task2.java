package Task2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {

    public List<String> topFiveHashTags(List<String> inputText) {

        if (inputText.size() == 0) {
            return new ArrayList<>();
        }

        Map<String, Integer> map = new HashMap<>();

        Pattern pattern = Pattern.compile("#[^\\s]+");


        for (String tmp : inputText) {

            Matcher matcher = pattern.matcher(tmp);


            String hashtag;

            List<String> uniqueHashtags = new ArrayList<>();

            while (matcher.find()) {

                hashtag = tmp.substring(matcher.start(), matcher.end());

                if (!uniqueHashtags.contains(hashtag)) {

                    uniqueHashtags.add(hashtag);

                    int amountOfHashtagsInText = map.containsKey(hashtag) ? map.get(hashtag) + 1 : 1;

                    map.put(hashtag, amountOfHashtagsInText);

                }
            }
        }
        List<String> topFive = new ArrayList<>();

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(5)
                .forEach((s) -> topFive.add(s.getKey()));

        List<String> result = new ArrayList<>();

        if (topFive.size() == 5) {

            int fifthPlaceCount = map.get(topFive.get(4));

            result = IntStream.range(1, 5).mapToObj(i -> topFive.get(i - 1)).map(hashTag -> hashTag + " - " + map.get(hashTag)).collect(Collectors.toList());

            List<String> tmpListToWriteInFifthPosition = new ArrayList<>();

            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).skip(4)
                    .forEach(
                            (s) -> {
                                if (map.get(s.getKey()) == fifthPlaceCount) {
                                    tmpListToWriteInFifthPosition.add(s.getKey());
                                }
                            });

            StringBuilder tmp = new StringBuilder();

            for (String s : tmpListToWriteInFifthPosition) {
                tmp.append(s).append(",");
            }

            tmp = new StringBuilder(tmp.substring(0, tmp.length() - 1));

            result.add(tmp + " - " + fifthPlaceCount);

        } else {
            for (String hashTag : topFive) {
                result.add(hashTag + " - " + map.get(hashTag));
            }
        }


        return result;
    }
}

