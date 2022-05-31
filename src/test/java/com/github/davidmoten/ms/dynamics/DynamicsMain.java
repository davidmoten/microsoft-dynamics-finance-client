package com.github.davidmoten.ms.dynamics;

import com.github.davidmoten.microsoft.dynamics.Dynamics;
import com.github.davidmoten.odata.client.PathStyle;

import microsoft.dynamics.dataentities.container.Resources;

public class DynamicsMain {

    public static void main(String[] args) {

        // build client
        Resources client = Dynamics //
                .service(Resources.class) //
                .pathStyle(PathStyle.IDENTIFIERS_IN_ROUND_BRACKETS) //
                .baseUrl("https://SOLUTION.axcloud.dynamics.com/data") //
                .tenantName("TENANT_NAME") //
                .resource("https://SOLUTION.axcloud.dynamics.com") //
                .clientId("CLIENT_ID") //
                .clientSecret("CLIENT_SECRET") //
                .build();

        // now use client
        client //
                .agents()
                .metadataMinimal() //
                .stream() //
                .limit(10) //
                .forEach(java.lang.System.out::println);

    }

}
