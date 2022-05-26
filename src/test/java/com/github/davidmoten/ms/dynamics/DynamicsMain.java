package com.github.davidmoten.ms.dynamics;

import com.github.davidmoten.microsoft.dynamics.Dynamics;

import microsoft.dynamics.dataentities.container.Resources;

public class DynamicsMain {

    public static void main(String[] args) {

        // build client
        Resources client = Dynamics //
                .service(Resources.class) //
                .baseUrl("https://SOLUTION.api.crm4.dynamics.com/api/data/v9.1/") //
                .tenantName("TENANT_NAME") //
                .resource("https://SOLUTION.crm4.dynamics.com") //
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
