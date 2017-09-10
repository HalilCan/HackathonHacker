import java.util.LinkedList;

public class Main {
    private static String[] categories = {"other","frontend","api","backend","route","sw","hw",
            "micro"};

    private static LinkedList<Choice> choices = new LinkedList<Choice>();

    public static void main(String[] args) {
        choices = generatePennApps17Choices();
    }

    public static LinkedList<Choice> generatePennApps17Choices () {
        LinkedList<Choice> choices = new LinkedList<Choice>();

        Choice RHealthCivic = new Choice();
        String RHC_name = "Real World Health (Health & Social/Civic Hack)";
        String[] RHC_categories = {"route"};
        String[] RHC_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] RHC_conflicts = {"route"};
        String[] RHC_keywords = {"civic innovation", "civic technology", "health innovation", "health app", "civic " +
                "app", "health startup", "civic startup"};
        Double RHC_value = 360.0;
        Double RHC_diffM = 3.0;
        Double RHC_diffW = 10.0;
        Double RHC_nebula = 10.0;
        RHealthCivic.setName(RHC_name);
        RHealthCivic.setCategories(RHC_categories);
        RHealthCivic.setSynergies(RHC_synergies);
        RHealthCivic.setConflicts(RHC_conflicts);
        RHealthCivic.setSynergies(RHC_keywords);
        RHealthCivic.setValue(RHC_value);
        RHealthCivic.setDiffMake(RHC_diffM);
        RHealthCivic.setDiffWin(RHC_diffW);
        RHealthCivic.setNebulousness(RHC_nebula);
        choices.add(RHealthCivic);

        Choice Redu = new Choice();
        String Redu_name = "Best Education Hack Sponsored by Palantir";
        String[] Redu_categories = {"route"};
        String[] Redu_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] Redu_conflicts = {"route"};
        String[] Redu_keywords = {"education app", "education technology", "education innovation", "education startup"};
        Double Redu_value = 300.0;
        Double Redu_diffM = 2.0;
        Double Redu_diffW = 9.0;
        Double Redu_nebula = 10.0;
        Redu.setName(Redu_name);
        Redu.setCategories(Redu_categories);
        Redu.setSynergies(Redu_synergies);
        Redu.setConflicts(Redu_conflicts);
        Redu.setSynergies(Redu_keywords);
        Redu.setValue(Redu_value);
        Redu.setDiffMake(Redu_diffM);
        Redu.setDiffWin(Redu_diffW);
        Redu.setNebulousness(Redu_nebula);
        choices.add(Redu);

        Choice Rhw= new Choice();
        String Rhw_name = "Best Hardware Hack";
        String[] Rhw_categories = {"route", "hw"};
        String[] Rhw_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] Rhw_conflicts = {"route"};
        String[] Rhw_keywords = {"hardware startup", "hardware hacks", "DIY tech"};
        Double Rhw_value = 500.0;
        Double Rhw_diffM = 3.0;
        Double Rhw_diffW = 10.0;
        Double Rhw_nebula = 10.0;
        Rhw.setName(Rhw_name);
        Rhw.setCategories(Rhw_categories);
        Rhw.setSynergies(Rhw_synergies);
        Rhw.setConflicts(Rhw_conflicts);
        Rhw.setSynergies(Rhw_keywords);
        Rhw.setValue(Rhw_value);
        Rhw.setDiffMake(Rhw_diffM);
        Rhw.setDiffWin(Rhw_diffW);
        Rhw.setNebulousness(Rhw_nebula);
        choices.add(Rhw);


        Choice RVrArSec= new Choice();
        String RVrArSec_name = "Best VR/AR or Cybersecurity Hack";
        String[] RVrArSec_categories = {"route"};
        String[] RVrArSec_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] RVrArSec_conflicts = {"route"};
        String[] RVrArSec_keywords = {"virtual reality", "cybersecurity", "artifical reality"};
        Double RVrArSec_value = 230.0;
        Double RVrArSec_diffM = 3.0;
        Double RVrArSec_diffW = 7.0;
        Double RVrArSec_nebula = 10.0;
        RVrArSec.setName(RVrArSec_name);
        RVrArSec.setCategories(RVrArSec_categories);
        RVrArSec.setSynergies(RVrArSec_synergies);
        RVrArSec.setConflicts(RVrArSec_conflicts);
        RVrArSec.setSynergies(RVrArSec_keywords);
        RVrArSec.setValue(RVrArSec_value);
        RVrArSec.setDiffMake(RVrArSec_diffM);
        RVrArSec.setDiffWin(RVrArSec_diffW);
        RVrArSec.setNebulousness(RVrArSec_nebula);
        choices.add(RVrArSec);

        Choice RGog= new Choice();
        String RGog_name = " Best Google Cloud Platform Hack Sponsored by Google";
        String[] RGog_categories = {"route", "sw"};
        String[] RGog_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] RGog_conflicts = {"route"};
        String[] RGog_keywords = {"Google Cloud", "Google NLP", "Google machine learning API", "Google image recognition api"};
        Double RGog_value = 3000.0;
        Double RGog_diffM = 2.0;
        Double RGog_diffW = 9.0;
        Double RGog_nebula = 10.0;
        RGog.setName(RGog_name);
        RGog.setCategories(RGog_categories);
        RGog.setSynergies(RGog_synergies);
        RGog.setConflicts(RGog_conflicts);
        RGog.setSynergies(RGog_keywords);
        RGog.setValue(RGog_value);
        RGog.setDiffMake(RGog_diffM);
        RGog.setDiffWin(RGog_diffW);
        RGog.setNebulousness(RGog_nebula);
        choices.add(RGog);

        Choice RAndro= new Choice();
        String RAndro_name = "Best Android Things Hack";
        String[] RAndro_categories = {"route", "hw", "sw"};
        String[] RAndro_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] RAndro_conflicts = {"route"};
        String[] RAndro_keywords = {"Android things", "Android things hack", "Internet of things"};
        Double RAndro_value = 1000.0;
        Double RAndro_diffM = 4.0;
        Double RAndro_diffW = 6.0;
        Double RAndro_nebula = 9.0;
        RAndro.setName(RAndro_name);
        RAndro.setCategories(RAndro_categories);
        RAndro.setSynergies(RAndro_synergies);
        RAndro.setConflicts(RAndro_conflicts);
        RAndro.setSynergies(RAndro_keywords);
        RAndro.setValue(RAndro_value);
        RAndro.setDiffMake(RAndro_diffM);
        RAndro.setDiffWin(RAndro_diffW);
        RAndro.setNebulousness(RAndro_nebula);
        choices.add(RAndro);

        Choice giphy= new Choice();
        String giphy_name = "Best Use of GIPHY API";
        String[] giphy_categories = {"api"};
        String[] giphy_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] giphy_conflicts = {};
        String[] giphy_keywords = {"GIPHY", "GIPHY API", "gif hacks"};
        Double giphy_value = 150.0;
        Double giphy_diffM = 1.0;
        Double giphy_diffW = 8.0;
        Double giphy_nebula = 7.0;
        giphy.setName(giphy_name);
        giphy.setCategories(giphy_categories);
        giphy.setSynergies(giphy_synergies);
        giphy.setConflicts(giphy_conflicts);
        giphy.setSynergies(giphy_keywords);
        giphy.setValue(giphy_value);
        giphy.setDiffMake(giphy_diffM);
        giphy.setDiffWin(giphy_diffW);
        giphy.setNebulousness(giphy_nebula);
        choices.add(giphy);

        Choice unique= new Choice();
        String unique_name = "1517 Most Unique Hack";
        String[] unique_categories = {"other"};
        String[] unique_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] unique_conflicts = {};
        String[] unique_keywords = {};
        Double unique_value = 3000.0;
        Double unique_diffM = 1.0;
        Double unique_diffW = 7.0;
        Double unique_nebula = 10.0;
        unique.setName(unique_name);
        unique.setCategories(unique_categories);
        unique.setSynergies(unique_synergies);
        unique.setConflicts(unique_conflicts);
        unique.setSynergies(unique_keywords);
        unique.setValue(unique_value);
        unique.setDiffMake(unique_diffM);
        unique.setDiffWin(unique_diffW);
        unique.setNebulousness(unique_nebula);
        choices.add(unique);

        Choice fb= new Choice();
        String fb_name = "Facebook's Favorite Hack";
        String[] fb_categories = {"other"};
        String[] fb_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] fb_conflicts = {};
        String[] fb_keywords = {};
        Double fb_value = 1500.0;
        Double fb_diffM = 1.0;
        Double fb_diffW = 7.0;
        Double fb_nebula = 10.0;
        fb.setName(fb_name);
        fb.setCategories(fb_categories);
        fb.setSynergies(fb_synergies);
        fb.setConflicts(fb_conflicts);
        fb.setSynergies(fb_keywords);
        fb.setValue(fb_value);
        fb.setDiffMake(fb_diffM);
        fb.setDiffWin(fb_diffW);
        fb.setNebulousness(fb_nebula);
        choices.add(fb);

        Choice webgl= new Choice();
        String webgl_name = "Best Use of WebGL/Graphics";
        String[] webgl_categories = {"other", "sw"};
        String[] webgl_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] webgl_conflicts = {};
        String[] webgl_keywords = {"webgl", "web graphics"};
        Double webgl_value = 100.0;
        Double webgl_diffM = 3.0;
        Double webgl_diffW = 5.0;
        Double webgl_nebula = 7.0;
        webgl.setName(webgl_name);
        webgl.setCategories(webgl_categories);
        webgl.setSynergies(webgl_synergies);
        webgl.setConflicts(webgl_conflicts);
        webgl.setSynergies(webgl_keywords);
        webgl.setValue(webgl_value);
        webgl.setDiffMake(webgl_diffM);
        webgl.setDiffWin(webgl_diffW);
        webgl.setNebulousness(webgl_nebula);
        choices.add(webgl);

        Choice alad= new Choice();
        String alad_name = "Best Use of Aladdin API";
        String[] alad_categories = {"other", "sw"};
        String[] alad_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] alad_conflicts = {};
        String[] alad_keywords = {"fintech", "financial hacks", "financial tech"};
        Double alad_value = 1000.0;
        Double alad_diffM = 6.0;
        Double alad_diffW = 6.0;
        Double alad_nebula = 3.0;
        alad.setName(alad_name);
        alad.setCategories(alad_categories);
        alad.setSynergies(alad_synergies);
        alad.setConflicts(alad_conflicts);
        alad.setSynergies(alad_keywords);
        alad.setValue(alad_value);
        alad.setDiffMake(alad_diffM);
        alad.setDiffWin(alad_diffW);
        alad.setNebulousness(alad_nebula);
        choices.add(alad);

        Choice lyft= new Choice();
        String lyft_name = "Best Use of Lyft API";
        String[] lyft_categories = {"other", "sw"};
        String[] lyft_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] lyft_conflicts = {};
        String[] lyft_keywords = {};
        Double lyft_value = 200.0;
        Double lyft_diffM = 1.0;
        Double lyft_diffW = 6.0;
        Double lyft_nebula = 5.0;
        lyft.setName(lyft_name);
        lyft.setCategories(lyft_categories);
        lyft.setSynergies(lyft_synergies);
        lyft.setConflicts(lyft_conflicts);
        lyft.setSynergies(lyft_keywords);
        lyft.setValue(lyft_value);
        lyft.setDiffMake(lyft_diffM);
        lyft.setDiffWin(lyft_diffW);
        lyft.setNebulousness(lyft_nebula);
        choices.add(lyft);

        Choice weather= new Choice();
        String weather_name = "Best Use of Earth Networks Weather Data API";
        String[] weather_categories = {"other", "sw"};
        String[] weather_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] weather_conflicts = {};
        String[] weather_keywords = {"weather map technology", "weather innovation"};
        Double weather_value = 200.0;
        Double weather_diffM = 4.0;
        Double weather_diffW = 5.0;
        Double weather_nebula = 3.0;
        weather.setName(weather_name);
        weather.setCategories(weather_categories);
        weather.setSynergies(weather_synergies);
        weather.setConflicts(weather_conflicts);
        weather.setSynergies(weather_keywords);
        weather.setValue(weather_value);
        weather.setDiffMake(weather_diffM);
        weather.setDiffWin(weather_diffW);
        weather.setNebulousness(weather_nebula);
        choices.add(weather);

        Choice expo= new Choice();
        String expo_name = "Best Use of Expo";
        String[] expo_categories = {"other", "sw"};
        String[] expo_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] expo_conflicts = {};
        String[] expo_keywords = {};
        Double expo_value = 400.0;
        Double expo_diffM = 3.0;
        Double expo_diffW = 7.0;
        Double expo_nebula = 10.0;
        expo.setName(expo_name);
        expo.setCategories(expo_categories);
        expo.setSynergies(expo_synergies);
        expo.setConflicts(expo_conflicts);
        expo.setSynergies(expo_keywords);
        expo.setValue(expo_value);
        expo.setDiffMake(expo_diffM);
        expo.setDiffWin(expo_diffW);
        expo.setNebulousness(expo_nebula);
        choices.add(expo);

        Choice dmn= new Choice();
        String dmn_name = "Best Domain Name from Domain.com";
        String[] dmn_categories = {"other"};
        String[] dmn_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] dmn_conflicts = {};
        String[] dmn_keywords = {};
        Double dmn_value = 50.0;
        Double dmn_diffM = 1.0;
        Double dmn_diffW = 6.0;
        Double dmn_nebula = 10.0;
        dmn.setName(dmn_name);
        dmn.setCategories(dmn_categories);
        dmn.setSynergies(dmn_synergies);
        dmn.setConflicts(dmn_conflicts);
        dmn.setSynergies(dmn_keywords);
        dmn.setValue(dmn_value);
        dmn.setDiffMake(dmn_diffM);
        dmn.setDiffWin(dmn_diffW);
        dmn.setNebulousness(dmn_nebula);
        choices.add(dmn);

        Choice aws= new Choice();
        String aws_name = "Best Use of AWS";
        String[] aws_categories = {"other","backend"};
        String[] aws_synergies = {"other", "frontend", "api", "sw", "hw", "micro"};
        String[] aws_conflicts = {"backend"};
        String[] aws_keywords = {};
        Double aws_value = 250.0;
        Double aws_diffM = 3.0;
        Double aws_diffW = 7.0;
        Double aws_nebula = 10.0;
        aws.setName(aws_name);
        aws.setCategories(aws_categories);
        aws.setSynergies(aws_synergies);
        aws.setConflicts(aws_conflicts);
        aws.setSynergies(aws_keywords);
        aws.setValue(aws_value);
        aws.setDiffMake(aws_diffM);
        aws.setDiffWin(aws_diffW);
        aws.setNebulousness(aws_nebula);
        choices.add(aws);

        Choice qlcm= new Choice();
        String qlcm_name = "Best IoT Hack Using a Qualcomm Device";
        String[] qlcm_categories = {"other", "hw", "micro"};
        String[] qlcm_synergies = {"other", "frontend", "api", "backend", "sw", "hw"};
        String[] qlcm_conflicts = {"micro"};
        String[] qlcm_keywords = {"internet of things"};
        Double qlcm_value = 75.0;
        Double qlcm_diffM = 5.0;
        Double qlcm_diffW = 5.0;
        Double qlcm_nebula = 7.0;
        qlcm.setName(qlcm_name);
        qlcm.setCategories(qlcm_categories);
        qlcm.setSynergies(qlcm_synergies);
        qlcm.setConflicts(qlcm_conflicts);
        qlcm.setSynergies(qlcm_keywords);
        qlcm.setValue(qlcm_value);
        qlcm.setDiffMake(qlcm_diffM);
        qlcm.setDiffWin(qlcm_diffW);
        qlcm.setNebulousness(qlcm_nebula);
        choices.add(qlcm);

        Choice fint= new Choice();
        String fint_name = "Best Financial Tech Hack";
        String[] fint_categories = {"other"};
        String[] fint_synergies = {"other", "frontend", "api", "backend", "sw", "hw", "micro"};
        String[] fint_conflicts = {};
        String[] fint_keywords = {"fintech", "financial hacks", "financial tech"};
        Double fint_value = 400.0;
        Double fint_diffM = 3.0;
        Double fint_diffW = 7.0;
        Double fint_nebula = 5.0;
        fint.setName(fint_name);
        fint.setCategories(fint_categories);
        fint.setSynergies(fint_synergies);
        fint.setConflicts(fint_conflicts);
        fint.setSynergies(fint_keywords);
        fint.setValue(fint_value);
        fint.setDiffMake(fint_diffM);
        fint.setDiffWin(fint_diffW);
        fint.setNebulousness(fint_nebula);
        choices.add(fint);

        return choices;
        //if no keywords then sort only by diff/nebula/val
    }

    public static void calculateDifficulty() {
        //calculate difficulties
    }

    public static Double cumulativeDif (Double totDif, Double totNeb, Double elemCount) {
        Double diff = Math.log10((totDif - totNeb)/elemCount);
        return diff;
    }
}
