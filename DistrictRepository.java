package az.ingress.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DistrictRepository {
    private Map<String, Integer> districtPopulation = new HashMap<>();

    public DistrictRepository() {
        districtPopulation.put("Nizami", 215000);
        districtPopulation.put("Narimanov", 180000);
        districtPopulation.put("Yasamal", 300000);
        districtPopulation.put("Binagadi", 270000);
        districtPopulation.put("Sabail", 160000);
        districtPopulation.put("Khatai", 250000);
        districtPopulation.put("Surakhani", 230000);
    }

    public Integer getPopulation(String district) {
        return districtPopulation.get(district);
    }

    public String getDistrictWithHighestPopulation() {
        int maxPopulation = districtPopulation.get("Nizami");
        String districtWithHighestPopulation = null;
        for (Map.Entry<String, Integer> district : districtPopulation.entrySet()) {
            if (district.getValue() > maxPopulation) {
                maxPopulation = district.getValue();
                districtWithHighestPopulation = district.getKey();
            }
        }
        return districtWithHighestPopulation;
    }
}
