package com.quang.identity_service.mapper;

import com.quang.identity_service.dto.request.PermissionRequest;
import com.quang.identity_service.dto.request.UserCreationRequest;
import com.quang.identity_service.dto.request.UserUpdateRequest;
import com.quang.identity_service.dto.response.PermissionResponse;
import com.quang.identity_service.dto.response.UserResponse;
import com.quang.identity_service.entity.Permission;
import com.quang.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
