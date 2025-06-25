package az.ingress.controller;

import az.ingress.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/districts")
@RequiredArgsConstructor
public class DistrictController {
    private final DistrictService districtService;

    @GetMapping("/population/{name}")
    public int getPopulation(@PathVariable("name") String name) {
        return districtService.getPopulation(name);
    }

    @GetMapping("/highest-population")
    public String getDistrictWithHighestPopulation() {
        return districtService.getDistrictWithHighestPopulation();
    }
}
