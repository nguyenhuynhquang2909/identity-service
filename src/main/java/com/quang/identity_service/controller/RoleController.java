package com.quang.identity_service.controller;

import com.quang.identity_service.dto.request.ApiResponse;
import com.quang.identity_service.dto.request.PermissionRequest;
import com.quang.identity_service.dto.request.RoleRequest;
import com.quang.identity_service.dto.response.PermissionResponse;
import com.quang.identity_service.dto.response.RoleResponse;
import com.quang.identity_service.enums.Role;
import com.quang.identity_service.service.PermissionService;
import com.quang.identity_service.service.RoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoleController {
    RoleService roleService;

    @PostMapping
    ApiResponse<RoleResponse> create(@RequestBody RoleRequest request) {
        return ApiResponse.<RoleResponse>builder()
                .result(roleService.create(request))
                .build();
    }

    @GetMapping
    ApiResponse<List<RoleResponse>> getAll() {
        return ApiResponse.<List<RoleResponse>>builder()
                .result(roleService.getAll())
                .build();
    }

    @DeleteMapping("/{role}")
    ApiResponse<Void> delete(@PathVariable String role) {
        roleService.delete(role);
        return ApiResponse.<Void>builder().build();
    }
}
