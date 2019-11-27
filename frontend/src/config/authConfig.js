const AUTH0_DOMAIN = 'https://dev-z1noh6-s.auth0.com';
const CLIENT_DOMAIN = 'http://localhost:8080';

const authConfig = {
  authority: AUTH0_DOMAIN,
  client_id: 'lDXLkqx8RMCfS04SrOCF2RxNARCIKXE7',
  client_secret: 'D524BElp7MvxR-RLSptUjwWby4_LwFSSJOeQnEAfkH_Bkr5cKT6xUAQxOeS_kL-q',
};

const clientConfig = {
  scope: 'profile email openid offline_access',
};

const clientUrl = {
  redirect_uri: `${CLIENT_DOMAIN}/callback`,
  silent_redirect_uri: `${CLIENT_DOMAIN}/silent-renew`,
};

const otherConfig = {
  response_type: 'code',
  filterProtocolClaims: true,
  loadUserInfo: true,
  prompt: "login",
};

const metadata = {
  issuer: AUTH0_DOMAIN + "/",
  token_endpoint : AUTH0_DOMAIN + "/oauth/token",
  authorization_endpoint: AUTH0_DOMAIN + "/authorize",
  userinfo_endpoint: AUTH0_DOMAIN + "/userinfo",
  end_session_endpoint: AUTH0_DOMAIN + "/v2/logout",
  jwks_uri: AUTH0_DOMAIN + "/.well-known/jwks.json",
}

export {
  authConfig, clientConfig, clientUrl, otherConfig, metadata
};
