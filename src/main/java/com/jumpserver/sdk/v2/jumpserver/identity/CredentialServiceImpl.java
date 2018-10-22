//package com.jumpserver.sdk.v2.jumpserver.identity;
//
//
//import com.jumpserver.sdk.v2.common.ActionResponse;
//import com.jumpserver.sdk.v2.common.BaseJMSService;
//
//import java.util.List;
//
//import static com.google.common.base.Preconditions.checkNotNull;
//import static com.jumpserver.sdk.v2.common.ClientConstants.PATH_CREDENTIALS;
//
//public class CredentialServiceImpl extends BaseJMSService implements CredentialService {
//
//    @Override
//    public Credential create(KeystoneCredential credential) {
//        checkNotNull(credential);
//        return post(KeystoneCredential.class, uri(PATH_CREDENTIALS)).entity(credential).execute();
//    }
//
//    @Override
//    public Credential create(String blob, String type, String projectId, String userId) {
//        checkNotNull(blob);
//        checkNotNull(type);
//        checkNotNull(projectId);
//        checkNotNull(userId);
//        return create(KeystoneCredential.builder().blob(blob).type(type).projectId(projectId).userId(userId).build());
//    }
//
//    @Override
//    public Credential get(String credentialId) {
//        checkNotNull(credentialId);
//        return get(KeystoneCredential.class, PATH_CREDENTIALS, "/", credentialId).execute();
//    }
//
//    @Override
//    public Credential update(Credential credential) {
//        checkNotNull(credential);
//        return patch(KeystoneCredential.class, PATH_CREDENTIALS, "/", credential.getId()).entity(credential).execute();
//    }
//
//    @Override
//    public ActionResponse delete(String credentialId) {
//        checkNotNull(credentialId);
//        return deleteWithResponse(PATH_CREDENTIALS, "/", credentialId).execute();
//    }
//
//    @Override
//    public List<? extends Credential> list() {
//        return get(Credentials.class, uri(PATH_CREDENTIALS)).execute().getList();
//    }
//
//}
