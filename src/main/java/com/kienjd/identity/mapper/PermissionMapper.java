package com.kienjd.identity.mapper;

import org.mapstruct.Mapper;

import com.kienjd.identity.dto.request.PermissionRequest;
import com.kienjd.identity.dto.response.PermissionResponse;
import com.kienjd.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
