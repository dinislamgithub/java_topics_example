package com.din.annotation_enum_regex.enums;

import java.io.Serializable;

public class EnumClass {
    public static enum AgentStatusEnum implements Serializable {
        Inactive(0),
        Active(1),
        Closed(2);

        private final int status;

        AgentStatusEnum(int status) {
            this.status = status;
        }

        public int getStatus() {
            return this.status;
        }
    }


    // will be as much lik this....

}
