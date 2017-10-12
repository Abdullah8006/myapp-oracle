INSERT
INTO "OAUTH_CLIENT_DETAILS"
    (
        CLIENT_ID, CLIENT_SECRET, SCOPE, AUTHORIZED_GRANT_TYPES,
        ACCESS_TOKEN_VALIDITY, REFRESH_TOKEN_VALIDITY, AUTOAPPROVE
    )
    VALUES
    (
        'my_client_id', 'secret', 'foo,read,write',
        'password,authorization_code,refresh_token', '36000', '36000'
        , 'true'
    );