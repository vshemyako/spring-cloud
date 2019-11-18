package org.laplas.licensing.controller;

import org.laplas.licensing.controller.dto.LicenceDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/organization/{organizationId}/licence")
@RestController
public class LicensingController {

    @GetMapping("/{licenceId}")
    public LicenceDto getLicence(@PathVariable String organizationId,
                                 @PathVariable String licenceId) {
        return LicenceDto.builder()
                         .id(licenceId)
                         .organizationId(organizationId)
                         .name("Licence")
                         .build();
    }
}
