const authDomain = 'https://dev-z1noh6-s.auth0.com';
const clientDomain = 'http://localhost:8080';

const authConfig = {
  authority: authDomain,
  client_id: 'lDXLkqx8RMCfS04SrOCF2RxNARCIKXE7',
  client_secret: 'D524BElp7MvxR-RLSptUjwWby4_LwFSSJOeQnEAfkH_Bkr5cKT6xUAQxOeS_kL-q',
};

const clientConfig = {
  scope: 'profile email openid offline_access',
};

const clientUrl = {
  redirect_uri: `${clientDomain}/callback`,
  silent_redirect_uri: `${clientDomain}/silent-renew`,
};

const otherConfig = {
  response_type: 'code',
  filterProtocolClaims: true,
  loadUserInfo: true,
  prompt: "login",
};

export {
  authConfig, clientConfig, clientUrl, otherConfig,
};
