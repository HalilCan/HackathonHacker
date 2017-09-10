public class Choice {
    private static String name;
    private static String[] categories;
    private static String[] synergies;
    private static String[] conflicts;

    private static String[] keywords;
    private static Double value;
    private static Double diffMake;
    private static Double diffWin;
    private static Double nebulousness;

    public static void Choice(String args) {    }

    public static String getName () {
        return name;
    }

    public static void setName (String name) {
        Choice.name = name;
    }

    public static String[] getCategories () {
        return categories;
    }

    public static void setCategories (String[] categories) {
        Choice.categories = categories;
    }

    public static String[] getSynergies () {
        return synergies;
    }

    public static void setSynergies (String[] synergies) {
        Choice.synergies = synergies;
    }

    public static String[] getConflicts () {
        return conflicts;
    }

    public static void setConflicts (String[] conflicts) {
        Choice.conflicts = conflicts;
    }

    public static String[] getKeywords () {
        return keywords;
    }

    public static void setKeywords (String[] keywords) {
        Choice.keywords = keywords;
    }

    public static Double getValue () {
        return value;
    }

    public static void setValue (Double value) {
        Choice.value = value;
    }

    public static Double getDiffMake () {
        return diffMake;
    }

    public static void setDiffMake (Double diffMake) {
        Choice.diffMake = diffMake;
    }

    public static Double getDiffWin () {
        return diffWin;
    }

    public static void setDiffWin (Double diffWin) {
        Choice.diffWin = diffWin;
    }

    public static Double getNebulousness () {
        return nebulousness;
    }

    public static void setNebulousness (Double nebulousness) {
        Choice.nebulousness = nebulousness;
    }
}
