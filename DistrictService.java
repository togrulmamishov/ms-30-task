package az.ingress.service;

import az.ingress.repository.DistrictRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DistrictService {
    private final DistrictRepository districtRepository;

    public Integer getPopulation(String district) {
        return districtRepository.getPopulation(district);
    }

    public String getDistrictWithHighestPopulation() {
        return districtRepository.getDistrictWithHighestPopulation();
    }
}
