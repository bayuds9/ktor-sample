package com.flowerencee9.marketplace.support.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants;", "", "()V", "TEXT_VALUE_TYPE", "app_debug"})
public final class BaseConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.flowerencee9.marketplace.support.base.BaseConstants INSTANCE = null;
    
    private BaseConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$TEXT_VALUE_TYPE;", "", "Companion", "app_debug"})
    public static abstract interface TEXT_VALUE_TYPE {
        @org.jetbrains.annotations.NotNull()
        public static final com.flowerencee9.marketplace.support.base.BaseConstants.TEXT_VALUE_TYPE.Companion Companion = null;
        public static final int VALUE_TEXT = 0;
        public static final int VALUE_CURRENCY = 1;
        public static final int VALUE_AMOUNT = 2;
        public static final int VALUE_PHONE = 3;
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/flowerencee9/marketplace/support/base/BaseConstants$TEXT_VALUE_TYPE$Companion;", "", "()V", "VALUE_AMOUNT", "", "VALUE_CURRENCY", "VALUE_PHONE", "VALUE_TEXT", "app_debug"})
        public static final class Companion {
            public static final int VALUE_TEXT = 0;
            public static final int VALUE_CURRENCY = 1;
            public static final int VALUE_AMOUNT = 2;
            public static final int VALUE_PHONE = 3;
            
            private Companion() {
                super();
            }
        }
    }
}