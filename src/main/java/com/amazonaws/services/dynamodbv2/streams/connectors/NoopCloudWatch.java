package com.amazonaws.services.dynamodbv2.streams.connectors;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.regions.Region;
import com.amazonaws.services.cloudwatch.AmazonCloudWatch;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchAsync;
import com.amazonaws.services.cloudwatch.model.DeleteAlarmsRequest;
import com.amazonaws.services.cloudwatch.model.DeleteAlarmsResult;
import com.amazonaws.services.cloudwatch.model.DeleteDashboardsRequest;
import com.amazonaws.services.cloudwatch.model.DeleteDashboardsResult;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmHistoryResult;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsForMetricResult;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsRequest;
import com.amazonaws.services.cloudwatch.model.DescribeAlarmsResult;
import com.amazonaws.services.cloudwatch.model.DisableAlarmActionsRequest;
import com.amazonaws.services.cloudwatch.model.DisableAlarmActionsResult;
import com.amazonaws.services.cloudwatch.model.EnableAlarmActionsRequest;
import com.amazonaws.services.cloudwatch.model.EnableAlarmActionsResult;
import com.amazonaws.services.cloudwatch.model.GetDashboardRequest;
import com.amazonaws.services.cloudwatch.model.GetDashboardResult;
import com.amazonaws.services.cloudwatch.model.GetMetricDataRequest;
import com.amazonaws.services.cloudwatch.model.GetMetricDataResult;
import com.amazonaws.services.cloudwatch.model.GetMetricStatisticsRequest;
import com.amazonaws.services.cloudwatch.model.GetMetricStatisticsResult;
import com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageRequest;
import com.amazonaws.services.cloudwatch.model.GetMetricWidgetImageResult;
import com.amazonaws.services.cloudwatch.model.ListDashboardsRequest;
import com.amazonaws.services.cloudwatch.model.ListDashboardsResult;
import com.amazonaws.services.cloudwatch.model.ListMetricsRequest;
import com.amazonaws.services.cloudwatch.model.ListMetricsResult;
import com.amazonaws.services.cloudwatch.model.PutDashboardRequest;
import com.amazonaws.services.cloudwatch.model.PutDashboardResult;
import com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest;
import com.amazonaws.services.cloudwatch.model.PutMetricAlarmResult;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.amazonaws.services.cloudwatch.model.PutMetricDataResult;
import com.amazonaws.services.cloudwatch.model.SetAlarmStateRequest;
import com.amazonaws.services.cloudwatch.model.SetAlarmStateResult;
import com.amazonaws.services.cloudwatch.waiters.AmazonCloudWatchWaiters;

import java.util.concurrent.Future;

/**
 * This class allows KCL to be started in a local environment against DynamoDB Local,
 * without CloudWatch connectivity.
 */
public class NoopCloudWatch implements AmazonCloudWatch, AmazonCloudWatchAsync {
    @Override
    public void setEndpoint(String s) {

    }

    @Override
    public void setRegion(Region region) {

    }

    @Override
    public DeleteAlarmsResult deleteAlarms(DeleteAlarmsRequest deleteAlarmsRequest) {
        return null;
    }

    @Override
    public DeleteDashboardsResult deleteDashboards(DeleteDashboardsRequest deleteDashboardsRequest) {
        return null;
    }

    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {
        return null;
    }

    @Override
    public DescribeAlarmHistoryResult describeAlarmHistory() {
        return null;
    }

    @Override
    public DescribeAlarmsResult describeAlarms(DescribeAlarmsRequest describeAlarmsRequest) {
        return null;
    }

    @Override
    public DescribeAlarmsResult describeAlarms() {
        return null;
    }

    @Override
    public DescribeAlarmsForMetricResult describeAlarmsForMetric(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {
        return null;
    }

    @Override
    public DisableAlarmActionsResult disableAlarmActions(DisableAlarmActionsRequest disableAlarmActionsRequest) {
        return null;
    }

    @Override
    public EnableAlarmActionsResult enableAlarmActions(EnableAlarmActionsRequest enableAlarmActionsRequest) {
        return null;
    }

    @Override
    public GetDashboardResult getDashboard(GetDashboardRequest getDashboardRequest) {
        return null;
    }

    @Override
    public GetMetricDataResult getMetricData(GetMetricDataRequest getMetricDataRequest) {
        return null;
    }

    @Override
    public GetMetricStatisticsResult getMetricStatistics(GetMetricStatisticsRequest getMetricStatisticsRequest) {
        return null;
    }

    @Override
    public GetMetricWidgetImageResult getMetricWidgetImage(GetMetricWidgetImageRequest getMetricWidgetImageRequest) {
        return null;
    }

    @Override
    public ListDashboardsResult listDashboards(ListDashboardsRequest listDashboardsRequest) {
        return null;
    }

    @Override
    public ListMetricsResult listMetrics(ListMetricsRequest listMetricsRequest) {
        return null;
    }

    @Override
    public ListMetricsResult listMetrics() {
        return null;
    }

    @Override
    public PutDashboardResult putDashboard(PutDashboardRequest putDashboardRequest) {
        return null;
    }

    @Override
    public PutMetricAlarmResult putMetricAlarm(PutMetricAlarmRequest putMetricAlarmRequest) {
        return null;
    }

    @Override
    public PutMetricDataResult putMetricData(PutMetricDataRequest putMetricDataRequest) {
        return null;
    }

    @Override
    public SetAlarmStateResult setAlarmState(SetAlarmStateRequest setAlarmStateRequest) {
        return null;
    }

    @Override
    public void shutdown() {

    }

    @Override
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return null;
    }

    @Override
    public AmazonCloudWatchWaiters waiters() {
        return null;
    }

    @Override
    public Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest deleteAlarmsRequest) {
        return null;
    }

    @Override
    public Future<DeleteAlarmsResult> deleteAlarmsAsync(DeleteAlarmsRequest deleteAlarmsRequest, AsyncHandler<DeleteAlarmsRequest, DeleteAlarmsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DeleteDashboardsResult> deleteDashboardsAsync(DeleteDashboardsRequest deleteDashboardsRequest) {
        return null;
    }

    @Override
    public Future<DeleteDashboardsResult> deleteDashboardsAsync(DeleteDashboardsRequest deleteDashboardsRequest, AsyncHandler<DeleteDashboardsRequest, DeleteDashboardsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest describeAlarmHistoryRequest) {
        return null;
    }

    @Override
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(DescribeAlarmHistoryRequest describeAlarmHistoryRequest, AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync() {
        return null;
    }

    @Override
    public Future<DescribeAlarmHistoryResult> describeAlarmHistoryAsync(AsyncHandler<DescribeAlarmHistoryRequest, DescribeAlarmHistoryResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest describeAlarmsRequest) {
        return null;
    }

    @Override
    public Future<DescribeAlarmsResult> describeAlarmsAsync(DescribeAlarmsRequest describeAlarmsRequest, AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DescribeAlarmsResult> describeAlarmsAsync() {
        return null;
    }

    @Override
    public Future<DescribeAlarmsResult> describeAlarmsAsync(AsyncHandler<DescribeAlarmsRequest, DescribeAlarmsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {
        return null;
    }

    @Override
    public Future<DescribeAlarmsForMetricResult> describeAlarmsForMetricAsync(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest, AsyncHandler<DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest disableAlarmActionsRequest) {
        return null;
    }

    @Override
    public Future<DisableAlarmActionsResult> disableAlarmActionsAsync(DisableAlarmActionsRequest disableAlarmActionsRequest, AsyncHandler<DisableAlarmActionsRequest, DisableAlarmActionsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest enableAlarmActionsRequest) {
        return null;
    }

    @Override
    public Future<EnableAlarmActionsResult> enableAlarmActionsAsync(EnableAlarmActionsRequest enableAlarmActionsRequest, AsyncHandler<EnableAlarmActionsRequest, EnableAlarmActionsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<GetDashboardResult> getDashboardAsync(GetDashboardRequest getDashboardRequest) {
        return null;
    }

    @Override
    public Future<GetDashboardResult> getDashboardAsync(GetDashboardRequest getDashboardRequest, AsyncHandler<GetDashboardRequest, GetDashboardResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest) {
        return null;
    }

    @Override
    public Future<GetMetricDataResult> getMetricDataAsync(GetMetricDataRequest getMetricDataRequest, AsyncHandler<GetMetricDataRequest, GetMetricDataResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest getMetricStatisticsRequest) {
        return null;
    }

    @Override
    public Future<GetMetricStatisticsResult> getMetricStatisticsAsync(GetMetricStatisticsRequest getMetricStatisticsRequest, AsyncHandler<GetMetricStatisticsRequest, GetMetricStatisticsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<GetMetricWidgetImageResult> getMetricWidgetImageAsync(GetMetricWidgetImageRequest getMetricWidgetImageRequest) {
        return null;
    }

    @Override
    public Future<GetMetricWidgetImageResult> getMetricWidgetImageAsync(GetMetricWidgetImageRequest getMetricWidgetImageRequest, AsyncHandler<GetMetricWidgetImageRequest, GetMetricWidgetImageResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest) {
        return null;
    }

    @Override
    public Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest listDashboardsRequest, AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest listMetricsRequest) {
        return null;
    }

    @Override
    public Future<ListMetricsResult> listMetricsAsync(ListMetricsRequest listMetricsRequest, AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<ListMetricsResult> listMetricsAsync() {
        return null;
    }

    @Override
    public Future<ListMetricsResult> listMetricsAsync(AsyncHandler<ListMetricsRequest, ListMetricsResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<PutDashboardResult> putDashboardAsync(PutDashboardRequest putDashboardRequest) {
        return null;
    }

    @Override
    public Future<PutDashboardResult> putDashboardAsync(PutDashboardRequest putDashboardRequest, AsyncHandler<PutDashboardRequest, PutDashboardResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest putMetricAlarmRequest) {
        return null;
    }

    @Override
    public Future<PutMetricAlarmResult> putMetricAlarmAsync(PutMetricAlarmRequest putMetricAlarmRequest, AsyncHandler<PutMetricAlarmRequest, PutMetricAlarmResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest putMetricDataRequest) {
        return null;
    }

    @Override
    public Future<PutMetricDataResult> putMetricDataAsync(PutMetricDataRequest putMetricDataRequest, AsyncHandler<PutMetricDataRequest, PutMetricDataResult> asyncHandler) {
        return null;
    }

    @Override
    public Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest setAlarmStateRequest) {
        return null;
    }

    @Override
    public Future<SetAlarmStateResult> setAlarmStateAsync(SetAlarmStateRequest setAlarmStateRequest, AsyncHandler<SetAlarmStateRequest, SetAlarmStateResult> asyncHandler) {
        return null;
    }
}
