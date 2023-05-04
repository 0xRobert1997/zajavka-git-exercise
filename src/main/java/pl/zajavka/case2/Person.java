package pl.zajavka.case2;

record Person(String name, String surname) {

    public String whatIsYourJob() {
        return "Software developer!";
    }

    public String whatDoYouLike() {
        return "Strawberries";
    }

    // local master changes
}
