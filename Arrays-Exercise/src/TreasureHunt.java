import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while (!"Yohoho!".equals(command)) {
            String[] tokens = command.split("\\s+");
            String currentCommand = tokens[0];

            switch (currentCommand) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        String currentItem = tokens[i];
                        boolean itemExist = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            String treasureItem = treasureChest[j];
                            if (currentItem.equals(treasureItem)) {
                                itemExist = true;
                                break;
                            }
                        }

                        if (!itemExist) {
                            String newTreasure = currentItem + " " + String.join(" ", treasureChest);
                            treasureChest = newTreasure.split("\\s+");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < treasureChest.length) {
                        String itemForRemove = treasureChest[index];
                        for (int i = index; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = itemForRemove;
                    }
                    break;
                case "Steal":
                    int stealItem = Integer.parseInt(tokens[1]);
                    String stolenTreasure = " ";
                    String newTreasure = " ";
                    for (int i = 0; i < treasureChest.length; i++) {
                        String currentElement = treasureChest[i];
                        if (i < treasureChest.length - stealItem) {
                            newTreasure += currentElement + " ";
                        } else {
                            stolenTreasure += currentElement + " ";
                        }
                    }
                    treasureChest = newTreasure.trim().split("\\s+");
                    System.out.println(String.join(", ", stolenTreasure.trim().split("\\s+")));
                    break;
            }

            command = scanner.nextLine();
        }

        double points = 0;
        for (String item : treasureChest) {
            points = points + item.length();
        }

        if (treasureChest.length == 0 || treasureChest[0].equals("")) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", points / treasureChest.length);
        }
    }
}
