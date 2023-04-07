package com.artsiomhanchar.exercises.section_3_working_with_text.Task_5;

public class ParseAddress {
//    5. Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
//same format, can you write code that can parse and print out:
//1. The building number: 12345
//2. The Street: “Big St.”
//3. City: “Alphabet City”
//4. State: “CA”
//5. Postal Code: 90210

    public static void main(String[] args) {
        String address = "12345 Big St., Alphabet City, CA 90210";

        System.out.println(parseAddress(address));
    }

    private static String parseAddress(String address) {
        String[] parsedAddress = address.split(", ");

        String buildingAndStreet = parsedAddress[0];
        int buildingAndStreetDividerSpaceIndex = buildingAndStreet.indexOf(" ");

        String[] stateAndIndex = parsedAddress[2].split(" ");
        String state = stateAndIndex[0];
        String postalCode = stateAndIndex[1];

        return new StringBuilder()
                .append("1. The building number: ")
                .append(buildingAndStreet.substring(0, buildingAndStreetDividerSpaceIndex))
                .append("\n")
                .append("2. The Street: ")
                .append("\"" + buildingAndStreet.substring(buildingAndStreetDividerSpaceIndex + 1) + "\"")
                .append("\n")
                .append("3. City: ")
                .append("\"" + parsedAddress[1] + "\"")
                .append("\n")
                .append("4. State: ")
                .append("\"" + state + "\"")
                .append("\n")
                .append("5. Postal Code: ")
                .append(postalCode)
                .toString();
    }
}
