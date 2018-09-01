/*
 * Copyright (c) 2014 - 2018. The Trustees of Indiana University, Moi University
 * and Vanderbilt University Medical Center.
 *
 * This version of the code is licensed under the MPL 2.0 Open Source license
 * with additional health care disclaimer.
 * If the user is an entity intending to commercialize any application that uses
 *  this code in a for-profit venture,please contact the copyright holder.
 */

package com.muzima.view.reports;

import android.app.Activity;
import com.muzima.view.SyncIntent;

import static com.muzima.utils.Constants.DataSyncServiceConstants.COHORT_IDS;
import static com.muzima.utils.Constants.DataSyncServiceConstants.SYNC_MUZIMA_GENERATED_REPORTS;
import static com.muzima.utils.Constants.DataSyncServiceConstants.SYNC_NOTIFICATIONS;
import static com.muzima.utils.Constants.DataSyncServiceConstants.SYNC_TYPE;
import static com.muzima.utils.Constants.NotificationStatusConstants.RECEIVER_UUID;

public class SyncMuzimaGeneratedReportIntent extends SyncIntent {
    public SyncMuzimaGeneratedReportIntent(Activity activity, String receiverUuid) {
        super(activity);
        putExtra(SYNC_TYPE, SYNC_MUZIMA_GENERATED_REPORTS);
        putExtra(RECEIVER_UUID, receiverUuid);
    }
}