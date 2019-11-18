package org.laplas.licensing.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class LicenceDto {
    private String id;
    private String organizationId;
    private String name;
}
