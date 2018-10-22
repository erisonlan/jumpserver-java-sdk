//package com.jumpserver.sdk.v2.jumpserver.identity;
//
//import com.jumpserver.sdk.v2.api.Apis;
//import com.jumpserver.sdk.v2.common.BaseJMSService;
//import com.jumpserver.sdk.v2.jumpserver.users.UserService;
//
///**
// * Identity V3 service implementation
// *
// */
//public class IdentityServiceImpl extends BaseJMSService implements IdentityService {
//
//    @Override
//    public CredentialService credentials() {
//        return Apis.get(CredentialService.class);
//    }
//
//    @Override
//    public DomainService domains() {
//        return Apis.get(DomainService.class);
//    }
//
//    @Override
//    public ProjectService projects() {
//        return Apis.get(ProjectService.class);
//    }
//
//    @Override
//    public UserService users() {
//        return Apis.get(UserService.class);
//    }
//
//    @Override
//    public RoleService roles() {
//        return Apis.get(RoleService.class);
//    }
//
//    @Override
//    public GroupService groups() {
//        return Apis.get(GroupService.class);
//    }
//
//    @Override
//    public PolicyService policies() {
//        return Apis.get(PolicyService.class);
//    }
//
//    @Override
//    public ServiceEndpointService serviceEndpoints() {
//        return Apis.get(ServiceEndpointService.class);
//    }
//
//    @Override
//    public RegionService regions() {
//        return Apis.get(RegionService.class);
//    }
//
//    @Override
//    public TokenService tokens() {
//        return Apis.get(TokenService.class);
//    }
//
//    @Override
//    public List<? extends Extension> listExtensions() {
//        return get(ExtensionList.class, PATH_EXTENSIONS).execute().getList();
//    }
//
//}
