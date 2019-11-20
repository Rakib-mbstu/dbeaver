/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.task;

import java.time.LocalDateTime;

/**
 * Scheduled task configration
 */
public class DBTTaskScheduleConfiguration {

    enum Frequency {
        MINUTELY,
        HOURLY,
        DAILY,
        WEEKLY,
        MONTHLY,
        ONE_TIME,
        EVENT
    }

    public String taskName;
    public String taskDescription;

    public String osUserName;

    public Frequency frequency;

    public LocalDateTime startTime;
    public LocalDateTime endTime;

    // Refines the schedule type to allow finer control over schedule recurrence
    public short recurrence;

    // Specifies day(s) of the week (for WEEKLY) or days of the month (for MONTHLY)
    public short[] days;
    // Specifies month(s) of the year
    public short[] months;

    // Repetition interval in minutes
    public int repetitionInterval;
    // Specifies the duration to run the task (in seconds)
    public int maxDuration;

}
