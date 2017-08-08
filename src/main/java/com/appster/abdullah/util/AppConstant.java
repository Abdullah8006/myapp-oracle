package com.appster.abdullah.util;

import javax.annotation.Resource;

@Resource
public class AppConstant {
    
    public enum DocumentOwner {
        USER, STUDENT
    }

    public enum DocumentType {
        BIRTH_CERTICATE, ADDRESS_PROOF
    }

    public enum NewsProducer {
        ADMIN, USER
    }

    public enum NewsConsumer {
        ADMIN, USER, STUDENT, ALL
    }

    public enum NotificationProducerType {
        ADMIN, USER
    }

    public enum NotificationConsumerType {
        USER, STUDENT
    }

    public enum StudentAssignmentReport {
        ZERO_PERCENT_COMPLETE, LESS_THAN_50_PERCENT_COMPLETE, LESS_THAN_100_PERCENT_COMPLETE, COMPLETE
    }

    public enum SeenStatus {
        NOT_SEEN, SEEN
    }

    public enum NotificationStatus {
        READ, UNREAD, DELETE
    }

    public enum Grade {
        APP, A, BPP, B, CPP, C
    }

    public enum AssignmentStatus {
        PENDING, COMPLETED
    }

    public enum AssignmentType {
        WRITING, READING, PHYSICAL, EXERCISE, SOCIAL_WORK
    }

    public enum InstituteType {
        SCHOOL, COLLEGE, OTHERS
    }

    public enum GuardianType {
        PARENT, RELATIVE
    }

    public enum AddressType {
        GEOGRAPHICAL, WORK, RESIDENCE
    }

    public enum UserType {
        ADMIN, PRINCIPLE, TEACHER, OTHERS
    }
    
}
